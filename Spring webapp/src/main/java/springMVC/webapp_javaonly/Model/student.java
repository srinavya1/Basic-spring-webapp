package springMVC.webapp_javaonly.Model;

import java.util.HashMap;

public class student {
	private HashMap countryList;
	private HashMap stateList;
	
public String fname;
public String lname;
private String language;
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
/**
 * 
 */
public student()
{
	

countryList =new HashMap<String,String>();
countryList.put("ind", "india");
countryList.put("us", "united states of America");
stateList=new HashMap<String,String>();
stateList.put("tn", "tamilnadu");
stateList.put("kl", "Kerala");
}
public HashMap getStateList() {
	return stateList;
}
public void setStateList(HashMap stateList) {
	this.stateList = stateList;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public HashMap getCountryList() {
	return countryList;
}
public void setCountryList(HashMap countryList) {
	this.countryList = countryList;
}
private String country;

private String state;

public String getCountry() {
	return country;
}
public void setCountry(String counry) {
	this.country = counry;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
}
