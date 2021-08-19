//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Stack;
//
//class Solution {
//    public String solution(int n, int k, String[] cmd) {
//        String answer = "";
//        
//        char ansimsi[] = new char[n];
//        
//        for(int i=0;i<n;i++)
//        	ansimsi[i] = 'O';
//        
//        int nowlength = n;
//        Stack<Integer> del = new Stack<Integer>();
//        
//        int now = k; //현재 선택된 행
//        
//        for(int i=0;i<cmd.length;i++)
//        {
//        	String imsis[] = cmd[i].split(" ");
//        	int imsisu = 0;
//        	if(imsis[0].equals("U"))
//        	{
//        		System.out.println("u");
//        		imsisu = Integer.parseInt(imsis[1]);
//        		now -= imsisu;
//        		
//        		if(now <=0)
//        			now = 0;
//        	}
//        	else if(imsis[0].equals("D"))
//        	{
//        		System.out.println("d");
//        		imsisu = Integer.parseInt(imsis[1]);
//        		now += imsisu;
//        		
//        		if(now >= nowlength)
//        			now = nowlength;
//        	}
//        	else if(imsis[0].equals("C"))
//        	{
//        		System.out.println("c");
//        		//삭제된 것 저장
//        		del.push(now);
//        		ansimsi[now] = 'X';
//        		nowlength--;
//        		
//        		//현재 선택된 행 삭제, 바로 아래행 선택
//        		if(now == nowlength) //삭제된 행이 가장 마지막 행인 경우 바로 윗행 선택
//        		{
//        			now--;
//        		}
//        		else if(nowlength<=0) //사이즈 0
//        			now =0;
//        	}
//        	else //Z인 경우 ->만약 위의 것이 추가되었을 시 위치 옮겨야 함
//        	{
//        		System.out.println("z");
//        		int imsidel = del.pop(); //지웠던거 뽑아냄
//        		if(now >= imsidel) //지웠던게 now보다 더 위에 있음 -> 복구시키면 한칸 밀리므로 now++
//        		{
//        			now++;
//        		}
//        		
//        		//지웠던 것 추가
//        		ansimsi[imsidel] = 'O';
//        		nowlength++;
//        	}
//        	System.out.println("now : "+now);
//        }
//        
//        answer = new String(ansimsi);
//        System.out.println(answer);
//        
//        
//        return answer;
//    }
//}
