class Solution
{
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k)
    {
        for(int i=k-1;i<nums.size()-k;i++)
        {
            boolean flag=true;
            for(int l=i-1,r=i+2;l>=i-k+1;l--,r++)
            {
                if(nums.get(l)>=nums.get(l+1)||nums.get(r-1)>=nums.get(r))
                {
                    flag=false;
                    break;
                }
            }

            if(flag)
                return true;
        }

        return false;
    }
}
