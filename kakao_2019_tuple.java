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
	    	
	    	//작은것부터 ans에 추가.
	        
	        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
	        String imsis[] = s.split("\\{|\\}");
	        
	        for(int i=0;i<imsis.length;i++) //튜플 저장
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

	        	//튜플 길이순으로 정렬
				@Override
				public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
					// TODO Auto-generated method stub
					if(o1.size()<o2.size())
						return -1;
					else
						return 1;
				}
	        });
	        
	        HashMap<Integer, Boolean> hash = new HashMap<Integer, Boolean>(); //숫자 있는지 검사용
	        int ansnow = 0;
	        int[] answer = new int[a.get(a.size()-1).size()]; //배열 크기는 제일 큰 튜플의 길이만큼 (모든 수를 포함하고 있으므로)
	        
	        for(int i=0;i<a.size();i++) //튜플 개수
	        {
	        	for(int j=0;j<a.get(i).size();j++) //튜플 내 개수
	        	{
	        		int now = a.get(i).get(j);
	        		if(hash.isEmpty() || hash.containsKey(now) == false) //처음보는 수일 시 hashmap, ans에 넣기
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
