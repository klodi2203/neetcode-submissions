class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:

        sum = 0
        maxSum = 0
        lenNum = len(nums)

        for i in range(lenNum):
            if nums[i] == 1:
                sum = sum + 1
                if(sum > maxSum):
                    maxSum = sum
            else:
                sum = 0
    

        return maxSum