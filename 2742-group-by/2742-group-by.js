/**
 * @param {Function} fn
 * @return {Object}
 */
Array.prototype.groupBy = function(fn) {
  return this.reduce((res, item) => {
    const key = fn(item);
    (res[key] ||= []).push(item);
    return res;
  }, {});
};

/**
 * [1,2,3].groupBy(String) // {"1":[1],"2":[2],"3":[3]}
 */