package com.ych;
import java.io.*;
import java.util.*;

public class Sort {

    public static  void  main(String args[]) throws UnsupportedEncodingException {
//         String filepath1="D:\\360极速浏览器下载";
//         String filepath2="D:\\Test";
//         moveFile(filepath1,filepath2);
           ArrayList<Integer> List=new ArrayList<>();
           List.add(67);List.add(33);List.add(21);List.add(84);List.add(49);List.add(50);List.add(75);
           quicksort(List,0,List.size()-1);
           for(Integer a:List)
           {
               System.out.println(a);
           }
    }



    public static  void selectedsort(ArrayList<Integer> List)
    {
        for(int i=0;i<List.size();i++)
        {
            int Smallpos=i;
            Integer Smallnum=List.get(i);
            for(int j=i+1;j<List.size();j++)
            {
                if(List.get(j)<Smallnum)
                {
                    Smallnum=List.get(j);
                    Smallpos=j;
                }
            }
            if(Smallpos!=i)
            {
                List.set(Smallpos,List.get(i));
                List.set(i,Smallnum);
            }
        }
    }

    public static void maopaosort(ArrayList<Integer> List)
    {
         for(int i=0;i<List.size();i++)
             for(int j=0;j<List.size()-i-1;j++)
             {
                 if(List.get(j)>List.get(j+1))
                 {
                     Integer temp=List.get(j);
                     List.set(j,List.get(j+1));
                     List.set(j+1,temp);
                 }
             }
    }

    public static  void quicksort(ArrayList<Integer> List,Integer first,Integer last)
    {
        if(first<last)
        {
            Integer stand=List.get(first);
            Integer leftpos=first+1;
            Integer rightpos=last;
            while(leftpos<rightpos)
            {
                if(List.get(leftpos)>stand)
                {
                    if(List.get(rightpos)<stand)
                    {
                        Integer temp=List.get(rightpos);
                        List.set(rightpos,List.get(leftpos));
                        List.set(leftpos,temp);
                        leftpos++;
                        rightpos--;
                    }else {
                        rightpos--;
                    }
                }else {
                    leftpos++;
                }
            }
            if(List.get(rightpos)>stand)
            {
                List.set(first,List.get(rightpos-1));
                List.set(rightpos-1,stand);
                quicksort(List ,first,rightpos-2);
                quicksort(List,rightpos,last);
            }else {
                List.set(first,List.get(rightpos));
                List.set(rightpos,stand);
                quicksort(List,first,rightpos-1);
                quicksort(List,rightpos+1,last);
            }

        }
    }

}
