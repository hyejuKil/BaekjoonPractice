//import java.util.Stack;
//
//public class kakao_2019_doll {
//class Solution {
//    public int solution(int[][] board, int[] moves) {
//	    Stack<Integer> s = new Stack<Integer>();
//        int answer = 0;
//        for(int i=0;i<moves.length;i++)
//	     {
//	    	  int now = moves[i]-1;
//	    	  for(int j=0;j<board[now].length;j++)
//	    	  {
//	    		  if(board[j][now] == 0) 
//	    			  continue;
//	    		  else //���� ����
//	    		  {
//	    			  if(s.isEmpty() || s.peek() != board[j][now])
//	    			  {
//	    				  s.push(board[j][now]);
//	    			  }
//	    			  else//���� ������ �̹� ���� ���
//	    			  {
//	    				  answer+=2;
//	    				  s.pop();
//	    			  }
//	    			  board[j][now] =0; //���� ������ ����
//	    			  break;
//	    		  }
//	    	  }
//	     }
//        return answer;
//    }
//}
//}
