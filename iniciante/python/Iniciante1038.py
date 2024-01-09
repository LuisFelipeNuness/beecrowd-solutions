A, B = input().split(" ")
A = int(A)
B = int(B)

if A == 1:
	A = 4.00
elif A == 2:
	A = 4.50
elif A == 3:
	A = 5.00
elif A == 4:
	A = 2.00
elif A == 5:
	A = 1.50

print("Total: R$ {:.2f}".format(B*A))
