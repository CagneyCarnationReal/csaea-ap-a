def check_animal(x):
    animal = x
    animals = ["cat", "dog", "blobfish", "shark", "owl", "toad"]
    for a in animals:
        if a == animal:
            print('animal is in the list')
            return
    print('animal is not in the list')

check_animal("cat")
check_animal("penguin")

    
            