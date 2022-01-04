package com.naresh;

import java.util.Map;

import com.naresh.dto.UserDto;

import java.time.LocalDate;
import java.util.Arrays;

public class CollectionExample {
	
	LocalDate dat;
	
	String collectionType;
	
	String[] collectionValues;
	
	Map<String, UserDto> props;
	
	public CollectionExample() {
		
	}
	
	public CollectionExample(UserDto user) {
		System.out.println("CE Parameterized Cons");
	}

	public String getCollectionType() {
		return collectionType;
	}

	public void setCollectionType(String collectionType) {
		this.collectionType = collectionType;
	}

	public String[] getCollectionValues() {
		return collectionValues;
	}

	public void setCollectionValues(String[] collectionValues) {
		this.collectionValues = collectionValues;
	}

	public LocalDate getDat() {
		return dat;
	}

	public void setDat(LocalDate dat) {
		System.out.println("hhhhhhhhhhhhhhhhh");
		this.dat = dat;
	}
	
	

	public Map<String, UserDto> getProps() {
		return props;
	}

	public void setProps(Map<String, UserDto> props) {
		this.props = props;
	}

	@Override
	public String toString() {
		return "CollectionExample [dat=" + dat + ", collectionType=" + collectionType + ", collectionValues="
				+ Arrays.toString(collectionValues) + ", props=" + props + "]";
	}

	
}
