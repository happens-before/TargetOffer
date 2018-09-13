package com.xupt.edu.bishi.dynamic;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.ArrayList;

public class Main {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        TreeSet<String> res = new TreeSet<>();
        if(str==null||str.length()==0) return list;
        char []chars=str.toCharArray();
        getResult(chars,0,str.length()-1,res);
        list.addAll(res);
        return list;
    }
    private void getResult(char []chars,int start,int end,TreeSet<String> res){
        if(start==end){
            res.add(String.valueOf(chars));
        }
        for(int i=start;i<=end;i++){
            swap(chars,start,i);
            getResult(chars,start+1,end,res);
            swap(chars,start,i);
        }
    }

    private void swap(char []chars,int a,int b){
        if(a==b){

        }else{
            char temp =chars[a];
            chars[a]=chars[b];
            chars[b]=temp;
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String string=new String();
        for(int i=0;i<=n;i++)
        {
            string=string+i;
        }
        ArrayList<String> list=new Main().Permutation(string);
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println(list.size());
    }
}
