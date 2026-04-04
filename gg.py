def critical(readings):
    # Split the input string by '|'
    values = readings.split("|")
    
    # Count how many times 'critical' appears
    return values.count("critical")


def main():
    # Read input from user
    readings = input().strip()
    
    # Call the function
    result = critical(readings)
    
    # Print the result
    print(result)


if __name__ == "__main__":
    main()