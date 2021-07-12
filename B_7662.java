import java.io.*;
import java.util.*;


public class B_7662 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		PriorityQueue<Long> q = new PriorityQueue<Long>(); //√÷º“»¸
		PriorityQueue<Long> rq = new PriorityQueue<Long>(Collections.reverseOrder());
		TreeMap<Long, Integer> isused = new TreeMap<Long,Integer>();
		
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++)
		{
			q.clear();
			rq.clear();
			isused.clear();
			int k = Integer.parseInt(br.readLine());
			for(int j=0;j<k;j++)
			{
				String inputs[] = br.readLine().split(" ");
				if(inputs[0].equals("I"))
				{
					Long su = Long.parseLong(inputs[1]);
					q.add(su); 
					rq.add(su);
					if(isused.containsKey(su))
					{
						int imsicount = isused.get(su);
						isused.replace(su, imsicount+1);
					}
					else
					{
						isused.put(su, 1);
					}
				}
				else
				{
					if(q.isEmpty())
						continue;
					if(inputs[1].equals("1")) //√÷¥Ò∞™
					{
						while(true)
						{
							if(q.isEmpty() || rq.isEmpty() || isused.isEmpty())
								break;
							Long su = rq.poll();
							if(isused.containsKey(su))
							{
								int imsicount = isused.get(su);
								if(imsicount ==1)
									isused.remove(su);
								else
									isused.replace(su, imsicount-1);
								break;
							}
						}
					}
					else //√÷º⁄∞™
					{
						while(true)
						{
							if(q.isEmpty() || rq.isEmpty() || isused.isEmpty())
								break;
							Long su = q.poll();
							if(isused.containsKey(su))
							{
								int imsicount = isused.get(su);
								if(imsicount ==1)
									isused.remove(su);
								else
									isused.replace(su, imsicount-1);
								break;
							}
						}
					}
				}
			}
			
			if(isused.isEmpty())
				bw.write("EMPTY\n");
			else
			{
				while(true) //√÷¥Î
				{
					if(rq.isEmpty())
					{
						bw.write("EMPTY\n");	
					}
					Long su = rq.poll();
					if(isused.containsKey(su))
					{
						bw.write(su+" ");
						break;
					}
				}
				while(true) //√÷º“
				{
					if(q.isEmpty())
					{
						bw.write("EMPTY\n");
						break;
					}
					Long su = q.poll();
					if(isused.containsKey(su))
					{
						bw.write(su+"\n");
						break;
					}
				}
			}
		}
		bw.flush();
	}
	
	
}
