import math

A, B, C = input().split(" ")
A = float(A)
B = float(B)
C = float(C)

delta = (B*B) - (4*A*C)

try:
	x1 = (-B + math.sqrt(delta))/(2*A)
	x2 = (-B - math.sqrt(delta))/(2*A)

	print("R1 = {:.5f}".format(x1))
	print("R2 = {:.5f}".format(x2))
except:
	print("Impossivel calcular")
