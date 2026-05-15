values = [4, 5, "hai", 7, [2, "python", [3, 4 + 2j]], 4]


def add(values):
    if len(values) == 0:
        return 0

    first = values[0]

    if isinstance(first, int):
        return first + add(values[1:])

    if isinstance(first, list):
        return add(first) + add(values[1:])

    return add(values[1:])


if __name__ == "__main__":
    print(add(values))
