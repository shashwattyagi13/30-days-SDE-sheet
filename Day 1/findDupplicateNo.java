//1
// class Solution {
//     public int findDuplicate(int[] nums) {
//         int i,j;
//     for( i=0;i<nums.length-1;i++)
//     {
//         for( j=i+1;j<nums.length;j++)
//         {
//             if(nums[i]==nums[j])
//                 return nums[i];
            
//         }
//     }
       
//    return 0;
//     }
//  }


//2.
// class Solution {
//     public int findDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for (int i = 0; i < nums.length-1; i++) {
//             if (nums[i] == nums[i+1]) {
//                 return nums[i];
//             }
//         }

//         return -1;
//     }
// }


//3
// class Solution {
//     public int findDuplicate(int[] nums) {
//         Set<Integer> seen = new HashSet<Integer>();
//         for (int num : nums) {
//             if (seen.contains(num)) {
//                 return num;
//             }
//             seen.add(num);
//         }

//         return -1;
//     }
// }


//4.
 // class Solution {
 //     public int findDuplicate(int[] nums) {
 //      int tor=0;
 //         int rab=0;
 //         int i;
 //         while(tor!=rab)
 //         {
 //                 tor=tor+1;
 //              rab=rab+2;
 //         }
 //         rab=0;
 //         tor=tor+1;
 //         rab=rab+1;
 //         return rab;
 //     }   
 // }
