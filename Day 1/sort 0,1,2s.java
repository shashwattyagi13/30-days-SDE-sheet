// class Solution {
//     public void sortColors(int[] nums) {
//         int i,j;
//1
    //    Arrays.sort(nums);
       
        
        
 //2       
//         for(i=0;i<nums.length;i++)
//         {
//             for(j=i+1;j<nums.length;j++)
//             {
//                 if(nums[j-1]>nums[j])
//                 {
//                     int t=nums[j-1];
//                 nums[j-1]=nums[j];
//                 nums[j]=t;
                    
//                 }
//             }
//         }
        //return nums[i];

    
//3        int nums[i]=0;
//         int count0=0;
//          int count1=0;
//          int count2=0;
        
//         for(i=0;i<nums.length;i++)
//         {
//             if(nums[i]==0)
//                 count0++;
//             if(nums[i]==1)
//             {
//                 count1++;
//                 nums[i]=0;
//             }
//             if(nums[i]==2)
//             {
//                 count2++;
//                 nums[i]=0;
//             }
//         }
        
//         for(i=0;i<count0;i++)
//             nums[i]=nums[i]+0;
//         for(i=count0;i<count0+count1;i++)
//             nums[i]=nums[i]+1;
//         for(i=count0+count1;i<count0+count1+count2;i++)
//             nums[i]=nums[i]+2;
        
        
        
        //4
//          int count0=0;
//          int count1=0;
//          int count2=0;
        
//         for(i=0;i<nums.length;i++)
//         {
//             if(nums[i]==0)
//                 count0++;
//             if(nums[i]==1)
//             {
//                 count1++;
//                 nums[i]=0;
//             }
//             if(nums[i]==2)
//             {
//                 count2++;
//                 nums[i]=0;
//             }
//         }
//         int index=0;
//          while(count0>0)
//          {
//              nums[index++]=0;
//              count0--;
//          }
//          while(count1>0)
//          {
//           nums[index++]=1;   
//              count1--;
//          }
//          while(count2>0)
//          {
//              nums[index++]=2;
//              count2--;
//          }
        
        
//     }
    
// }