import time

def fibonacci_sum(n):
    a, b = 0, 1
    suma = 0
    for _ in range(n):
        suma += a
        a, b = b, a + b
    return suma

inicio = time.time()
resultado = fibonacci_sum(5000)
fin = time.time()

with open("/benchmark/lenguajes/python/resultado.txt", "w") as f:
    f.write(str(resultado))

print(f"{((fin - inicio) * 1000):.2f}")

 
