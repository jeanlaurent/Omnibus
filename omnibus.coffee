class Omnibus
  constructor: ->
    @commands = []

  reset: ->
    @commands = []

  call: ->

  next: ->
    if @commands.length == 0
      @commands.push 'OPEN', 'CLOSE', 'UP' for i in [1..5]
      @commands.push 'OPEN', 'CLOSE', 'DOWN' for i in [1..5]
    @commands.shift()

module.exports = Omnibus