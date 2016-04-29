
-- Insert Functionality

INSERT INTO adm_functionality(id, name) VALUES (1, 'Users');
INSERT INTO adm_functionality(id, name) VALUES (2, 'Groups');

-- Insert Group

INSERT INTO adm_group(id, name) VALUES (1, 'Administrator');
INSERT INTO adm_group(id, name) VALUES (2, 'Operator');

-- Insert Group Functionality

INSERT INTO group_func(id_group, id_functionality) VALUES (1, 1);
INSERT INTO group_func(id_group, id_functionality) VALUES (1, 2);
INSERT INTO group_func(id_group, id_functionality) VALUES (2, 1);