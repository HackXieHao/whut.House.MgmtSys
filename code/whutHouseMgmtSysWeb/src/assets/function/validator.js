export const checkNum = (rule, value, callback) => {
  const RULES = /^\d{0,3000}$/
  if (!value) {
    callback();
  } else if (!RULES.test(value)) {
    callback(new Error("必须为数字"));
  } else {
    callback();
  }
};

export const checkTel = (rule, value, callback) => {
  const RULES = /^1\d{10}$/
  if (!value) {
    callback();
  } else if (!RULES.test(value)) {
    callback(new Error("手机号码格式不正确"));
  } else {
    callback();
  }
};

export const checkNULL = (rule, value, callback) => {
  if (!value) {
    callback(new Error(`选项不能为空`));
  } else {
    callback();
  }
};

export const checkEmail = (rule, value, callback) => {
  const RULES = /^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/
  if (!value) {
    callback();
  } else if (!RULES.test(value)) {
    callback(new Error("邮箱格式不正确"));
  } else {
    callback();
  }
};
