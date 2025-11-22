def Calculator(s) -> int:
    copy = str(s)
    list = copy.split(" ")
    
    operators = ('+', '-', '*', '/', '^')
    
    stack = []
    
    for token in list:
        if token in operators:
            temp_1 = stack.pop()
            temp_2 = stack.pop()
            
            result = 0
             
             
            stack.append(result)
            
        else:
            stack.append(int(token))
            
    out = stack.pop()
    
    return out