INSERT INTO users (username, password, enabled)
  values ('user',
    'pass',
    true);
 
    
INSERT INTO users (username, password, enabled)
  values ('nishu',
    'nana',
    true);

    INSERT INTO authorities (username, authority)
  values ('user', 'ROLE_USER');
  
  INSERT INTO authorities (username, authority)
  values ('nishu', 'ROLE_ADMIN');