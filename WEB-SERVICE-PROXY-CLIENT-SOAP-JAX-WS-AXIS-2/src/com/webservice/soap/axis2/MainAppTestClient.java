package com.webservice.soap.axis2;

public class MainAppTestClient {

	public static void main(String[] args) throws Exception{
		CalculatorServiceStub stub= new CalculatorServiceStub();
		
		//add
		CalculatorServiceStub.Add params=new CalculatorServiceStub.Add();
		params.setA(20);
		params.setB(30);
		
		CalculatorServiceStub.AddResponse response=stub.add(params);
		int  addResult=response.get_return();
		
		System.out.println("ADD : "+addResult);
		
		//subtract
		  CalculatorServiceStub.Subtract params2=new CalculatorServiceStub.Subtract();
		  params2.setA(100);
		  params2.setB(10);
		  
		  CalculatorServiceStub.SubtractResponse response2=stub.subtract(params2);
		  int subtractResult=response2.get_return();
		  System.out.println("SUBTRACT : "+subtractResult);
		 

	}

}
