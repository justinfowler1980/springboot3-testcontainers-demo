create table user_account
(
    id         uuid        not null,
    version    int         not null,
    cognito_id uuid        not null,
    basiq_id   varchar(50) null,
    postcode   varchar(15) not null,

    constraint user_pk primary key (id),
    constraint user_cognito_id unique (cognito_id),
    constraint user_basiq_id unique (basiq_id)
);