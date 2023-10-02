
test_list = [[('Gfg', 3), ('is', 3)], [('best', 1)],
             [('for', 5), ('geeks', 1)]]

print("The original list is : " + str(test_list))

cus_eles = [6, 7, 8]

res = [[(idx, val) for idx in key] for key, val in zip(test_list, cus_eles)]

print("The matrix after row elements addition : " + str(res))
