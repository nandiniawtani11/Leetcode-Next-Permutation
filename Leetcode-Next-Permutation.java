class Solution {
    public void nextPermutation(int[] nums) {
        int i=0;
              for(i=nums.length-1;i>=1;i--)
              {
                  if(nums[i]>nums[i-1])
                  {
                      int nextmax=nums[i];
                      int j=i;
                      int k=j;
                      for(j=i;j<nums.length;j++)
                      {
                          if(nums[j]>nums[i-1] && nums[j]<nextmax)
                          {
                              nextmax=Math.min(nextmax,nums[j]);
                              k=j;                              
                          }
                      }
                      nums[k]=nums[i-1];
                      nums[i-1]=nextmax;
                      break;
                  } 
              }
        Arrays.sort(nums,i,nums.length); 
    }
}
