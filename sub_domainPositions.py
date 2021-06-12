import math

origin_point = 11
sub_domain = 4
N = 5
yDim = 15
i_values = []

'''
sub_domain = desired number of sub domains 
N = length of a given sub domain 
M = N * yDim

For a board of domain size (K = 225) determine the lower left corner of a fractination of 9
'''

i = 0
multiplier = 0
while i < math.sqrt(sub_domain):
    i_values.append(origin_point + (multiplier * N))
    i += 1
    multiplier += 1

holding = []
for i in i_values:
    q = 1
    while q < (math.sqrt(sub_domain)):
        holding.append(i + (q * (N * yDim)))
        q += 1

for i in holding:
    i_values.append(i)

i_values.sort()
print(i_values)
print(len(i_values))


