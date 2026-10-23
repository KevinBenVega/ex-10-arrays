```pascal
INICI
    DEFINIR array1 COM ARRAY DE 5 ENTERS
    DEFINIR array2 COM ARRAY DE 5 ENTERS

    PER i DES DE 0 FINS A array1.length - 1
        ESCRIURE("Ingrese el numero: ", i)
        LLEGIR(num)
        array1[i] <- num
    FIN PER
    
    PER i DES DE 0 FINS A array2.length - 1
        ESCRIURE("Ingrese el numero: ", i)
        LLEGIR(num)
        array2[i] <- num
    FIN PER

    DEFINIR array3 COM ARRAY DE 5 ENTERS

    PER i DES DE 0 FINS A array1.length - 1
        array3[i] <- array1[i] + array2[i]
    FIN PER

    PER i DES DE 0 FINS A array1.length - 1
        ESCRIURE(array1[i])
    FIN PER

    PER i DES DE 0 FINS A array2.length - 1
    ESCRIURE(array2[i])
    FIN PER
    
    PER i DES DE 0 FINS A array3.length - 1
    ESCRIURE(array3[i])
    FIN PER
FI
```