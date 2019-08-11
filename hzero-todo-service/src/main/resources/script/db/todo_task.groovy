package script.db

databaseChangeLog(logicalFilePath: 'todo_task.groovy') {
    changeSet(id: '2018-11-20-todo_task', author: 'your.email@email.com') {
        createTable(tableName: "TODO_TASK") {
            column(name: 'ID', type: 'BIGINT UNSIGNED', remarks: 'ID', autoIncrement: true) { constraints(primaryKey: true) }
            column(name: 'EMPLOYEE_ID', type: 'BIGINT', remarks: '员工ID') { constraints(nullable:"false") }
            column(name: 'STATE', type: 'VARCHAR(30)', remarks: '状态') { constraints(nullable:"false") }
            column(name: 'TASK_NUMBER', type: 'VARCHAR(60)', remarks: '任务编号') { constraints(unique: true, nullable:"false") }
            column(name: 'TASK_DESCRIPTION', type: 'VARCHAR(240)', remarks: '任务描述')
            column(name: 'TENANT_ID', type: 'BIGINT', remarks: '租户ID') { constraints(nullable:"false") }
            column(name: "OBJECT_VERSION_NUMBER", type: "BIGINT", defaultValue: "1")
            column(name: "CREATED_BY", type: "BIGINT", defaultValue: "-1")
            column(name: "CREATION_DATE", type: "DATETIME", defaultValueComputed: "CURRENT_TIMESTAMP")
            column(name: "LAST_UPDATED_BY", type: "BIGINT", defaultValue: "-1")
            column(name: "LAST_UPDATE_DATE", type: "DATETIME", defaultValueComputed: "CURRENT_TIMESTAMP")
        }
    }
}