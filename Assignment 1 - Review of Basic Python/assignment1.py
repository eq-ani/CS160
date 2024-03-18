
def is_prime(num):
    for i in range(num - 1, 1, -1):
        if num % i == 0:
            return False
    return True

#print(is_prime(8))
#print(is_prime(1235))
#print(is_prime(13))
#print(is_prime(7))
#print(is_prime(4391))

def are_relatively_prime(num1, num2):
    if num1 > num2:
        x = num2
        y = num1
    else:
        x = num1
        y = num2
    for i in range (x, 1, -1):
        if is_prime(i):
            if x % i == 0 and y % i == 0:
                return False
    return True

#print(are_relatively_prime(20, 14))
#print(are_relatively_prime(24, 9))
#print(are_relatively_prime(11, 11))
#print(are_relatively_prime(23, 7))
#print(are_relatively_prime(31, 42))

def primes(num):
    prime_list = []
    for i in range (2, num + 1, 1):
        if is_prime(i):
            prime_list.append(i)
    return prime_list

#print(primes(10))
#print(primes(15))
#print(primes(7))
#print(primes(2))
#print(primes(123))

def prime_decomposition(num):
    prime_list = []
    while (num > 1):
        for i in range(2, num + 1, 1):
            if is_prime(i):
                if num % i == 0:    
                    prime_list.append(i)
                    num = num // i
                    break
    return prime_list

#print(prime_decomposition(2))
#print(prime_decomposition(91))
#print(prime_decomposition(128))
#print(prime_decomposition(5))
#print(prime_decomposition(75))