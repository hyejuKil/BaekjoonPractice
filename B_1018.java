//
//public class B_1018 {
//    //�Է�
//    String imsis[] = br.readLine().split(" ");
//    int n = Integer.parseInt(imsis[0]);
//    int m = Integer.parseInt(imsis[1]);
//    String imsi;
//    char first = 0;
//    int count=0,count2=0; //�ٲ�� ���� ��
//    char b[][] = new char[n+1][m+1];
//    
//    for(int i=0;i<n;i++)
//    {
//  	  imsi = br.readLine(); //���� �б�
//  	  for(int j=0;j<m;j++)
//  		  b[i][j] = imsi.charAt(j);
//    }
//    
//    first = b[0][0];
//    int mincount=-1, mincount2 = -1;
//    
//    for(int k=0;k<n+1-8;k++)
//    {
//  	  for(int l=0;l<m+1-8;l++)
//  	  {
//  		  count=0;
//  		  count2=0;
//  		  for(int i=k;i<k+8;i++)
//  	      {
//  	    	  for(int j=l;j<l+8;j++)
//  	    	  {
//  	    		  if((i%2)==(j%2)) //¦¦, ȦȦ -> ������ ������
//  	    		  {
//  	    			  if(b[i][j] != first) //�ٸ� ��� change
//  	    				  count++;
//  	    			  if(b[i][j] == first) //�ٸ� ��� change
//  	    				  count2++;
//  	    			  
//  	    		  }
//  	    		  else //¦Ȧ, Ȧ¦ -> ������ �޶�� ��
//  	    		  {
//  	    			  if(b[i][j] == first) //���� ��� change
//  	    				  count++;
//  	    			  if(b[i][j] != first) //���� ��� change
//  	    				  count2++;
//  	    		  }
//  	    	  }
//  	      }  
//  		  if(mincount == -1)
//  			  mincount = count;
//  		  else
//  			  mincount = min(mincount,count);
//  		  
//  		  if(mincount2 == -1)
//  			  mincount2 = count2;
//  		  else
//  			  mincount2 = min(mincount2,count2);  
//  	  }
//    }
//    
//    bw.write(min(mincount, mincount2)+"\n");
//}
