class Solution {
    public int minDeletionSize(String[] strs) {
       String[] result = new String[strs[0].length()];
		int outPut =0;
		Arrays.fill(result, "");
			

		for(int i=0; i<strs.length;i++)
		{
			for(int j=0; j<strs[i].length();j++)
			{
				result[j]+= strs[i].charAt(j);
			}
		}
		
		
		for(int i=0; i<result.length;i++)
		{
			for(int j=0; j<result[i].length()-1;j++)
			{
				if(result[i].charAt(j)> result[i].charAt(j+1))
				{
					result[i]="1";
					break;
				}
			}
		}

		
		for(String strs2 : result )
		{
			if(strs2 =="1")
			{
				outPut++;
			}
		}
        
        return outPut;
    }
}
