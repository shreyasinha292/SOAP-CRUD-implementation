package com.accolite.soap;

import java.util.HashMap;


import javax.jws.WebService;
@WebService(endpointInterface="com.accolite.soap.Person_CRUD")
public class PersonImpl implements Person_CRUD {

	public PersonImpl() {
		// TODO Auto-generated constructor stub
	}
	
	private static HashMap<Integer, Person> per_list = new HashMap<Integer,Person>();

	@Override
	public void create_item(int id, String name, String contact) {
		Person p1 = new Person();
		p1.setName(name);
		p1.setId(id);
		p1.setContact(contact);
		
		per_list.put(id, p1);
		
	}

	@Override
	public void delete_item(int id) {
		
		per_list.remove(id);
		
	}

	@Override
	public void update_item(int id, String new_name, String new_contact) {
		
		Person p1 = per_list.get(id);
		p1.setName(new_name);
		p1.setContact(new_contact);
		
	}

	@Override
	public Person retrieve_item(int id) {
		
		Person p1 = per_list.get(id);
		return p1;
	}

	@Override
	public Person[] display_all() {
		
		Person[] p1 = new Person[per_list.size()];
		for(int i = 0;i < per_list.size();i++) {
			p1[i] = per_list.get(i);
		}
		
		return p1;
	}
	
	

}

class Person{
	
	private String name;
	private String contact;
	private int id;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getContact() {
		return contact;
	}
	
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
		
}