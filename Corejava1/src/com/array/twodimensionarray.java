package com.array;

import Basic.BufferReader;
import Basic.BuffereReader;
import Basic.InputStreamReader;

public class twodimensionarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[][]=new int[3][3];
BufferReader bufferedReader = new BuffereReader(new InputStreamReader(system.in));
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		System.out.println("enter value at ["+i+"]["+j"]position);"
		ar[i]=Integer.parseInt(bufferedReader.readLine());
	}
}
