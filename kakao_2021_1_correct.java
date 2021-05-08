
public class kakao_2021_1_correct {
	class Solution {
	    public int solution(String s) {
	        int answer = 0;
	        int count=0;
	        
	        char b[] = new char[50];
	        int bnow =0;
	        for(int i=0;i<s.length();i++)
	        {
	        	//현재 수가 숫자이면 배열에 넣기
	        	char now = s.charAt(i); //현재 String 자리
	        	if(now >='0' && now <='9') //숫자이면 그냥 넣기
	        	{
	        		//System.out.println("in");
	        		b[bnow++] = now;
	            	count++;
	        	}
	        	else //문자열일 경우
	        	{
	        		int j=i;
	        		while((s.charAt(j) <='z' && s.charAt(j) >='a')) //z가 문자일 동안 j++
	        		{
	        			j++;
	        			if(j == s.length())
	        				break;
	        		}
	        		j--;
	        		
	        		String imsiString = s.substring(i, j); //문자열 잠시 컷
	        		while(imsiString.equals("") == false)
	        		{
	            		char start=imsiString.charAt(0);
	            		char next = imsiString.charAt(1);
//	            		System.out.println(start);
//	            		System.out.println(next);
//	            		System.out.println("i : "+i+" j : "+j);
	            		if(start == 'z') //0
	            		{
	            			b[bnow++] = '0';
	            			i+=4;
	            		}
	            		else if(start == 'o')
	            		{
	            			b[bnow++] = '1';
	            			i+=3;
	            		}
	            		else if(start == 't')
	            		{
	            			if(next == 'w') //2
	            			{
	                			b[bnow++] = '2';
	                			i+=3;	
	            			}
	            			else //3
	            			{
	            				b[bnow++] = '3'; 
	            				i+=5;
	            			}
	            		}
	            		else if(start == 'f')
	            		{
	            			if(next == 'o') //4
	            			{
	                			b[bnow++] = '4';	
	            			}
	            			else //5
	            			{
	            				b[bnow++] = '5';
	            			}
	            			i+=4;
	            		}
	            		else if(start == 's')
	            		{
	            			if(next == 'i') //6
	            			{
	                			b[bnow++] = '6';
	                			i+=3;
	            			}
	            			else //7
	            			{
	            				b[bnow++] = '7';
	            				i+=5;
	            			}
	            		}
	            		else if(start == 'e') //8
	            		{
	            			b[bnow++] = '8';
	            			i+=5;
	            		}
	            		else //9
	            		{
	            			b[bnow++] = '9';
	            			i+=4;
	            		}
	            		
	                	count++;
	            		if(i>=j)
	            		{
	            			i--;
	            			break;
	            		}
	            		else
	            			imsiString = s.substring(i,j);
	        		}
	        		
	        	}
	        }
	        
	        char a[] = new char[count];
	        
	        for(int i=0;i<count;i++)
	        	a[i] = b[i];
	        
	        answer = Integer.parseInt(new String(a));
	        
	        System.out.println(answer);
	        
	        return answer;
	    }
	}
}
