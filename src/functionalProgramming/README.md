# java.util.function package

## Function
`Function<T, R>`: Representa una función que acepta un argumento de tipo `T` y produce un resultado de tipo `R`.

## BiFunction
`BiFunction<T, U, R>`: Representa una función que acepta dos argumentos de tipo `T` y `U` y produce un resultado de tipo `R`.

## Consumer
`Consumer<T>`: Representa una operación que acepta un solo argumento de tipo `T` y no devuelve ningún resultado.

## BiConsumer
`BiConsumer<T, U>`: Representa una operación que acepta dos argumentos de tipo `T` y `U` y no devuelve ningún resultado.

## Supplier
`Supplier<R>`: Representa una función que no acepta ningún argumento y produce un resultado de tipo `R`.

## Predicate
`Predicate<T>`: Representa una función que acepta un solo argumento de tipo `T` y devuelve un valor booleano.

## BiPredicate
`BiPredicate<T, U>`: Representa una función que acepta dos argumentos de tipo `T` y `U` y devuelve un valor booleano.

## UnaryOperator
`UnaryOperator<T>`: Es una especialización de Function que acepta un argumento `T` y devuelve un resultado del mismo tipo.

## BinaryOperator
`BinaryOperator<T>`: Es una especialización de BiFunction que acepta dos argumentos del mismo tipo `T` y devuelve un resultado del mismo tipo.