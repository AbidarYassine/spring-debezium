-- create table start
CREATE TABLE IF NOT EXISTS campaigns (id bigint not null, statut_courant integer, name varchar(255));
-- CREATE TABLE IF NOT EXISTS comments (id bigint not null, contenu varchar(255), campaign_bo_id bigint, user_bo_id bigint, primary key (id));
-- CREATE TABLE IF NOT EXISTS users (id bigint not null, name varchar(255), primary key (id));

-- ALTER TABLE campaigns add constraint FK4b426jrng2p6s9orv5suqfcaq foreign key (user_bo_id) references users (id);
-- ALTER TABLE comments add constraint FKpj8nxor41yn0xs1h48crag0fb foreign key (campaign_bo_id) references campaigns (id);
-- ALTER TABLE comments add constraint FKwl85ien2gui9q6739c7g5vntsds foreign key (user_bo_id) references users (id);
-- create table end