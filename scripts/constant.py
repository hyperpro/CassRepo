from enum import Enum


KEY_SPACE = 'ycsb'
TABLE_NAME = 'usertable'
KEY = 'y_id'


class QueryType(Enum):
    READ = 'read'
    UPDATE = 'update'
    SCAN = 'scan'
    INSERT = 'insert'