import tqdm
import itertools

original_list = ["r", "r", "r", "b", "b", "b", "b", "b", "g", "g", "g", "g", "g", "g", "g"]

red = 0
failed = 0

for i in tqdm.tqdm(itertools.permutations(original_list, 15)):
    r = 0
    b = 0
    g = 0
    for m in i:
        if m == "r":
            r += 1
        elif m == "b":
            b += 1
        else:
            g += 1
        if r == 3:
            red += 1
            break;
        elif b == 5 or g == 7:
            failed += 1
            break;

print(red)
print(failed)

print(red / failed)