## Java класс, который позволяет вывести результат MapReduce задачи во множество каталогов. Имя каталога определяется ключом, при этом сам ключ в файлы не добавляется

Сборка:

mvn package

Использование:

spark-submit ... --jars MultipleOutputByKey.jar

rdd.saveAsHadoopFile('out', 'com.example.MultipleTextOutputFormatByKey')