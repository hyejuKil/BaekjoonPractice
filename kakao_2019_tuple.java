	import java.util.ArrayList;
	import java.util.Collection;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.HashMap;
	import java.util.LinkedList;
	import java.util.Queue;

public class kakao_2019_tuple {

	class Solution {
	    public int[] solution(String s) {
	    	
	    	//�����ͺ��� ans�� �߰�.
	        
	        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
	        String imsis[] = s.split("\\{|\\}");
	        
	        for(int i=0;i<imsis.length;i++) //Ʃ�� ����
	        {
	        	ArrayList<Integer> li = new ArrayList<Integer>();
	        	String imsi[] = imsis[i].split(",");
	        	for(int j=0;j<imsi.length;j++)
	        	{
	        		if(imsi[j].equals(""))
	        			break;
	        		li.add(Integer.parseInt(imsi[j]));
	        	}
	        	if(li.isEmpty())
	        		continue;
	        	else
	        		a.add(li);
	        }
	       
	        Collections.sort(a, new Comparator<ArrayList<Integer>>() {

	        	//Ʃ�� ���̼����� ����
				@Override
				public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
					// TODO Auto-generated method stub
					if(o1.size()<o2.size())
						return -1;
					else
						return 1;
				}
	        });
	        
	        HashMap<Integer, Boolean> hash = new HashMap<Integer, Boolean>(); //���� �ִ��� �˻��
	        int ansnow = 0;
	        int[] answer = new int[a.get(a.size()-1).size()]; //�迭 ũ��� ���� ū Ʃ���� ���̸�ŭ (��� ���� �����ϰ� �����Ƿ�)
	        
	        for(int i=0;i<a.size();i++) //Ʃ�� ����
	        {
	        	for(int j=0;j<a.get(i).size();j++) //Ʃ�� �� ����
	        	{
	        		int now = a.get(i).get(j);
	        		if(hash.isEmpty() || hash.containsKey(now) == false) //ó������ ���� �� hashmap, ans�� �ֱ�
	        		{
	        			hash.put(now, true);
	        			answer[ansnow++] = now;
	        			break;
	        		}
	        			
	        	}
	        }
	        
	        return answer;
	    }
	}

}
