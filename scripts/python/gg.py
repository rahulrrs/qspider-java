def critical(readings):
    values = readings.split("|")
    return values.count("critical")


def main():
    readings = input().strip()
    print(critical(readings))


if __name__ == "__main__":
    main()
