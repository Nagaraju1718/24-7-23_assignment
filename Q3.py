#Description: Consider data with assorted details of socks pair IDs. Each element in the array represents a number of similar pairs. You will have to find out how many singular socks are present which do not have any pair left.
#Sample input: arrNum = {10, 20, 20, 10, 10, 30, 50, 10, 20}
#Output: Count of singular socks = 3
#Explanation : Socks Id - 10: total count 4 => Two pairs of socks - no singular left
#Socks Id - 20: total count 3 => One pair of socks - 1 singular left
#Socks Id - 30: total count 1 => No pair of socks - 1 singular left
#Socks Id - 50: total count 1 => No pair of socks - 1 singular left
#So, Total number of Singular socks = 3


a=list(map(int,input().split()))
b=[]
count=0
for i in a:
    if(i not in b):
        n=a.count(i)
        if(n%2!=0):
            count+=1
        b.append(i)
print(count)