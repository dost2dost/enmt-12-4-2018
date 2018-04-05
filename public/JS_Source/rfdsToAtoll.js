/**
 * Created by Iraj on 07-Feb-18.
 */

var globalData;


var trnTable ;
var cellTable ;

$(function(){


    trnTable = $('#transmitterTable').DataTable();
    cellTable = $('#cellTable').DataTable();
    getActiveTabId();

});


$('#submitFile').click(function (event) {

    event.preventDefault();

    var file = $('#fileUpload').get(0).files[0];

    console.log("file:" + file);

    //if(formData.has('file')){
    if(typeof file !='undefined'){

        dataSheetName = file.name;
        var formData = new FormData();
        formData.append('file', file);

        globalData =[] ;

        $.ajax({
            url: '/data/transmitter/rfdsToAtoll',
            data: formData,
            type: 'POST',
            contentType: false,
            processData: false,
            success: function (rsp) {

                globalData = JSON.parse(rsp);
                //console.log(data.transmitter.length);
                if(globalData.transmitter == "Sheet is already parsed"){

                    alert(globalData.transmitter);

                }else{
                    displayTransmitterTable(globalData,'transmitterId');

                }

            },

            error: function (err){

                alert(err.responseText);
            }
        });

    }else{

        alert("Please Select File To Upload!");

    }

    return false;

});

    function displayTransmitterTable(_response,_elementClicked){


            var selectedData=[];

            if(_elementClicked =='transmitterId'){

                    trnTable.destroy();
                    if(_response.transmitter.length!=0){

                        for(var a=0; a<_response.transmitter.length; a++){

                            var arrayList=[];
                            arrayList.push(a+1);
                            arrayList.push(_response.transmitter[a].site);
                            arrayList.push(_response.transmitter[a].transmitter);
                            arrayList.push(_response.transmitter[a].antenna);
                            arrayList.push(_response.transmitter[a].height);
                            arrayList.push(_response.transmitter[a].azimuth);
                            arrayList.push(_response.transmitter[a].mechanicalDownTilt);
                            arrayList.push(_response.transmitter[a].numberOfTransmissionAntennaPorts);
                            arrayList.push(_response.transmitter[a].numberOfReceptionAntennaPorts);
                            arrayList.push(_response.transmitter[a].feederType);
                            arrayList.push(_response.transmitter[a].transmissionFeederLength);
                            arrayList.push(_response.transmitter[a].receptionFeederLength);
                            arrayList.push(_response.transmitter[a].tmaEquipment); 
                            arrayList.push(_response.transmitter[a].antennaPosition);
                            arrayList.push(_response.transmitter[a].rhAtTop);
                            arrayList.push(_response.transmitter[a].cssBaseUseid);
                            arrayList.push(_response.transmitter[a].retAvailable);
                            arrayList.push(_response.transmitter[a].tiltSharedUmtsLte);
                            arrayList.push(_response.transmitter[a].totalNbOfPhysicalAntennas);
                            arrayList.push(_response.transmitter[a].miscellaneousReceptionLosses);
                            arrayList.push(_response.transmitter[a].mainPropagationModel);
                            arrayList.push(_response.transmitter[a].mainCalculationRadius);
                            arrayList.push(_response.transmitter[a].mainResolution);
                            arrayList.push(_response.transmitter[a].extendedPropagationModel);
                            arrayList.push(_response.transmitter[a].extendedCalculationRadius);
                            arrayList.push(_response.transmitter[a].extendedResolution);
                            selectedData.push(arrayList);
                        }

                    }

                    trnTable=  $('#transmitterTable').DataTable({
                        data:           selectedData
                    }).draw(false);


            }else if(_elementClicked =='cellId'){

                cellTable.destroy();

                if(_response.cell.length!=0){


                    for(var a=0; a<_response.cell.length; a++){

                        var arrayList=[];

                        arrayList.push(a+1);
                        arrayList.push(_response.cell[a].name);
                        arrayList.push(_response.cell[a].transmitter);
                        arrayList.push(_response.cell[a].frequencyBand);

                        arrayList.push(_response.cell[a].maxPowerDbm);
                        arrayList.push(_response.cell[a].frameConfiguration);
                        arrayList.push(_response.cell[a].cssUseId);

                        arrayList.push(_response.cell[a].relCellNo);
                        arrayList.push(_response.cell[a].cssSectorId);
                        arrayList.push(_response.cell[a].iplanJobNumber);

                        arrayList.push(_response.cell[a].maxPuschCINDb);

                        selectedData.push(arrayList);
                    }
                }

                cellTable= $('#cellTable').DataTable({
                    data:           selectedData
                }).draw(false);

            }

    }


    function downloadExcel(){

        if(getDateTime() !=""){

            $.ajax({
                url: "/data/download/exportToExcel/"+getActiveTabId()+"/"+getDateTime() ,
                type: "GET",
                contentType: "application/json",
                success: function (response) {

                    try {

                        console.log(response);

                        if(response =="error"){

                            alert("No Data Found");

                        }else{

                            window.open('/retrieveExcel/'+response);
                        }


                    } catch (err) {

                        alert(err);
                        console.log(err);
                    }
                }

            });

        }else{

            alert("Please Select Date!");
        }

    }

    function getActiveTabId(){

        var activeTabId;

        $('#report_tab > li').find("a").each(function() {

            if($(this).attr('class') == "nav-link active"){
                activeTabId = $(this).attr('href').replace('#','');
            }
        });

        return activeTabId;
    }


    function getDateTime(){

        return $('#dateTime').val() ||"";
    }


$('#report_tab > li').on('click',function(e){

    displayTransmitterTable(globalData , e.target.id);

});
