package com.xupt.edu.bishi.lianjia;


import java.util.*;

public class SheTuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int data[][] = new int[n][2];
        int data1[][] = new int[n][2];
        for(int i=0;i<n;i++){
            data[i][0]=sc.nextInt();
            data1[i][0]=data[i][0];
            data[i][1]=sc.nextInt();
            data1[i][1]=data[i][1];
        }
        // 使用Lambda表达式
        //Arrays.parallelSort(arr1,(o1,o2) -> o1.length() - o2.length());
        Arrays.sort(data,(x,y)->x[0]-y[0]);
        int cnt=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int flag = 1;
            int high=-1;
            for(int j=0;j<n;j++)
            {
                if(j!=i)
                {
                    if(high==-1)
                    {
                        high=data[j][1];
                    }
                    else
                    {
                        if(high > data[j][0])
                        {
                            flag=0;
                            break;
                        }
                        else
                        {
                            high=data[j][1];
                        }
                    }
                }
            }
            if(flag==1)
            {
                cnt+=1;
                map.put(data[i][0],data[i][1]);
            }
        }

        System.out.println(cnt);
        for(int i=0;i<n;i++)
        {
            System.out.print(map.get(data1[i][0]) +" ");
            System.out.print(map.get(3) +" ");

            if(map.get(data1[i][0])!=null && map.get(data1[i][0])==data1[i][1]){
                System.out.print(i+1+" ");
            }
        }
    }
}