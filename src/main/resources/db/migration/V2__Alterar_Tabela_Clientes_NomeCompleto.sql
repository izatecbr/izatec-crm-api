ALTER TABLE public.tab_cliente ALTER COLUMN nome_completo TYPE varchar(100) USING nome_completo::varchar;
ALTER TABLE public.tab_cliente ALTER COLUMN nome_completo SET NOT NULL;
