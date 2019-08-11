package script.db

databaseChangeLog(logicalFilePath: 'todo_user.groovy') {
    changeSet(id: '2018-11-20-todo_user', author: 'your.email@email.com') {
        createTable(tableName: "TODO_USER") {
            column(name: 'ID', type: 'BIGINT UNSIGNED', remarks: 'ID', autoIncrement: true) {
                constraints(primaryKey: true)
            }
            column(name: 'EMPLOYEE_NAME', type: 'VARCHAR(32)', remarks: '员工名')
            column(name: 'EMPLOYEE_NUMBER', type: 'VARCHAR(32)', remarks: '员工号') {
                constraints(unique: true)
            }
            column(name: 'EMAIL', type: 'VARCHAR(32)', remarks: '邮箱')

            column(name: "OBJECT_VERSION_NUMBER", type: "BIGINT", defaultValue: "1")
            column(name: "CREATED_BY", type: "BIGINT", defaultValue: "-1")
            column(name: "CREATION_DATE", type: "DATETIME", defaultValueComputed: "CURRENT_TIMESTAMP")
            column(name: "LAST_UPDATED_BY", type: "BIGINT", defaultValue: "-1")
            column(name: "LAST_UPDATE_DATE", type: "DATETIME", defaultValueComputed: "CURRENT_TIMESTAMP")
        }
    }
}