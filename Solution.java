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
//        int now = k; //���� ���õ� ��
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
//        		//������ �� ����
//        		del.push(now);
//        		ansimsi[now] = 'X';
//        		nowlength--;
//        		
//        		//���� ���õ� �� ����, �ٷ� �Ʒ��� ����
//        		if(now == nowlength) //������ ���� ���� ������ ���� ��� �ٷ� ���� ����
//        		{
//        			now--;
//        		}
//        		else if(nowlength<=0) //������ 0
//        			now =0;
//        	}
//        	else //Z�� ��� ->���� ���� ���� �߰��Ǿ��� �� ��ġ �Űܾ� ��
//        	{
//        		System.out.println("z");
//        		int imsidel = del.pop(); //�������� �̾Ƴ�
//        		if(now >= imsidel) //�������� now���� �� ���� ���� -> ������Ű�� ��ĭ �и��Ƿ� now++
//        		{
//        			now++;
//        		}
//        		
//        		//������ �� �߰�
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
