package com.beans;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ShapeCollection {
	private List<String> shapeOfList;
	private Set<String> shapeOfSet;
	private Map<String, String> shapeOfMap;
	

	public List<String> getShapeOfList() {
		return shapeOfList;
	}

	public void setShapeOfList(List<String> shapeOfList) {
		this.shapeOfList = shapeOfList;
	}

	public Set<String> getShapeOfSet() {
		return shapeOfSet;
	}

	public void setShapeOfSet(Set<String> shapeOfSet) {
		this.shapeOfSet = shapeOfSet;
	}

	public Map<String, String> getShapeOfMap() {
		return shapeOfMap;
	}

	public void setShapeOfMap(Map<String, String> shapeOfMap) {
		this.shapeOfMap = shapeOfMap;
	}

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ShapeCollection [shapeOfList=");
		builder.append(shapeOfList);
		builder.append(", shapeOfSet=");
		builder.append(shapeOfSet);
		builder.append(", shapeOfMap=");
		builder.append(shapeOfMap);
		builder.append("]");
		return builder.toString();
	}
public void getMap()
{
	for(Entry<String,String> entry:shapeOfMap.entrySet())
	{
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	}
}