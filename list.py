# l = [4,5,'hai',7,[2,'python',[3,4+2j]],4]
# x=0
# sum=0
# while x < len(l):
#     i=l[x]
#     if type(i)==int:
#         sum = sum + i
#     if type(i)==list:
#         for j in i:
#             if type(j)==int:
#                 sum = sum + j
#             if type(j)==list:
#                 for z in j:
#                     if type(z)==int:
#                         sum = sum + z
#     x=x+1   
# print("\n")
# print("\n")
# print("Sum of the list:",sum)
# print("\n")
# print("\n")



l = [4,5,'hai',7,[2,'python',[3,4+2j]],4]

def add(l):
    if len(l) == 0:
        return 0

    first = l[0]

    if type(first) == int:
        return first + add(l[1:])

    elif type(first) == list:
        return add(first) + add(l[1:])

    else:
        return add(l[1:])

print(add(l))