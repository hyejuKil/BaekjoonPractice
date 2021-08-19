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
//	    		  else //인형 있음
//	    		  {
//	    			  if(s.isEmpty() || s.peek() != board[j][now])
//	    			  {
//	    				  s.push(board[j][now]);
//	    			  }
//	    			  else//만약 같은것 이미 있을 경우
//	    			  {
//	    				  answer+=2;
//	    				  s.pop();
//	    			  }
//	    			  board[j][now] =0; //인형 뺐으니 삭제
//	    			  break;
//	    		  }
//	    	  }
//	     }
//        return answer;
//    }
//}
//}
