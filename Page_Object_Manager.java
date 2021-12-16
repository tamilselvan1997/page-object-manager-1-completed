package org.pom;

import org.openqa.selenium.WebDriver;

import com.pom.Home_Page;
import com.pom.Image_Page;
import com.pom.Login_Page;
import com.pom.Page_10;
import com.pom.Page_11;
import com.pom.Page_12;
import com.pom.Page_13;
import com.pom.Page_6;
import com.pom.Page_7;
import com.pom.Page_8;
import com.pom.Page_9;
import com.pom.Single_Frame;
import com.pom.Tshirt_Page;

public class Page_Object_Manager {

	public WebDriver driver;

	private Home_Page hp;
	private Login_Page lp;
	private Tshirt_Page sp;
	private Image_Page ip;
	private Single_Frame sf;
	private Page_6 p6;
	private Page_7 p7;
	private Page_8 p8;
	private Page_9 p9;
	private Page_10 pg10;
	private Page_11 pg11;
	private Page_12 pg12;
	private Page_13 pg13;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Home_Page gethp() {
		if (hp == null) {

			hp = new Home_Page(driver);

		}
		return hp;
	}

	public Login_Page getlp() {

		if (lp == null) {
			lp = new Login_Page(driver);

		}
		return lp;
	}

	public Tshirt_Page getsp() {
		if (sp == null) {
			sp = new Tshirt_Page(driver);

		}
		return sp;
	}

	public Image_Page getip() {
		if (ip == null) {
			ip = new Image_Page(driver);

		}
		return ip;

	}

	public Single_Frame getsf() {
		if (sf == null) {
			sf = new Single_Frame(driver);
		}
		return sf;
	}

	public Page_6 getpage6() {
		if (p6 == null) {
			p6 = new Page_6(driver);

		}
		return p6;
	}

	public Page_7 getpage7() {
		if (p7 == null) {
			p7 = new Page_7(driver);

		}
		return p7;
	}

	public Page_8 getpage8() {
		if (p8 == null) {
			p8 = new Page_8(driver);

		}
		return p8;
	}

	public Page_9 getpage9() {
		if (p9 == null) {
			p9 = new Page_9(driver);

		}
		return p9;
	}

	public Page_10 getpage10() {
		if (pg10 == null) {
			pg10 = new Page_10(driver);

		}
		return pg10;
	}

	public Page_11 getpage11() {
		if (pg11 == null) {
			pg11 = new Page_11(driver);

		}
		return pg11;
	}

	public Page_12 getpage12() {
		if (pg12 == null) {
			pg12 = new Page_12(driver);
		}
		return pg12;
	}

	public Page_13 getpage13() {
		if (pg13 == null) {
			pg13 = new Page_13(driver);

		}
		return pg13;
	}

}
