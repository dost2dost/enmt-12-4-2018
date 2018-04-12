package controllers;

import Services.Vdate;
import Util_Rpt.ReadExcelFiles;
import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlRow;
import models.FinalTemplate;
import models.UserDetails;
import play.Logger;
import play.data.Form;
import play.data.FormFactory;

import play.mvc.Result;
import play.mvc.Controller;
import play.mvc.Security;

import views.html.Login;
import views.html.RecordSAved;
import views.html.index;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Dost Muhammad on 4/11/2018.
 */
//
public class LoginController extends Controller {
private static Form<UserDetails> frmUser;

@Inject

    public LoginController(FormFactory formFactory) {
    this.frmUser=formFactory.form(UserDetails.class);
    }

    public Result autheticate(){
        UserDetails usd=frmUser.bindFromRequest().get();
    String sql="SELECT  count(\"user\") as count \n" +
            "\tFROM public.\"userDetails\"\n" +
            "\twhere \"user\"='"+usd.getUser()+"'\n" +
            "\tand \"password\"='"+usd.getPassword()+"'";

        Logger.info("sql"+sql);

        SqlRow row= Ebean.createSqlQuery(sql).findUnique();

        int x= Integer.parseInt(row.get("count").toString());



    if(x>0){

        ReadExcelFiles objexcel= new ReadExcelFiles();
        ArrayList<FinalTemplate> lstfinal= null;
        try {
            lstfinal = objexcel.GetDataFromFinalTemplate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return  ok(RecordSAved.render(lstfinal));

        //return redirect(routes.RptController.index1());
    }else {
        flash("error", "Login credentials not valid.");

        return redirect(routes.LoginController.login());
    }


    }
    public Result signOut(){
        session().clear();
        return  ok(Login.render(frmUser));
    }
    public Result login(){
       // final Form<UserDetails> boundForm = frmUser.bindFromRequest();
        //UserDetails usdetail=boundForm.get();

    //return  ok(usdetail.getUser()+"email "+usdetail.getEmail()+"password "+usdetail.getPassword());
    return  ok(Login.render(frmUser));
    }



}
